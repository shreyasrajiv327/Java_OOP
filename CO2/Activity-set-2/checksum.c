#include <stdio.h>
#include <stdlib.h>

// Define constants
#define MAX_DATA_LEN 128
#define NUM_TESTS 3

// Define structure
struct Packet {
    int len;             // length of data array within the structure
    unsigned short data[MAX_DATA_LEN]; // data array of length len
    unsigned short checksum; // computed checksum value of the above data
};

// Function to compute checksum
unsigned short cksum(unsigned short *buf, int count) {
    register unsigned long sum = 0;

    while (count--) {
        sum += *buf++;
        if (sum & 0xFFFF0000) {
            sum &= 0xFFFF;
            sum++;
        }
    }

    return -(sum & 0xFFFF);
}

// Function to validate checksum
int checksum_validate(struct Packet *packet) {
    unsigned short original_checksum = packet->checksum;
    packet->checksum = 0; // Reset checksum for recomputation
    unsigned short new_checksum = cksum(packet->data, packet->len);

    return (original_checksum == new_checksum);
}

int main() {
    // Initialize random seed for introducing errors
    srand(42);

    // Test data lengths
    int test_lengths[NUM_TESTS] = {32, 64, 128};

    for (int i = 0; i < NUM_TESTS; i++) {
        // Create a packet
        struct Packet packet;
        packet.len = test_lengths[i];

        // Fill data array with random values
        for (int j = 0; j < packet.len; j++) {
            packet.data[j] = rand() % 65536; // random 16-bit values
        }

        // Compute checksum and store in the packet
        packet.checksum = cksum(packet.data, packet.len);

        // Test 1: Without any changes
        printf("Test %d: Without any changes - ", i + 1);
        if (checksum_validate(&packet)) {
            printf("Passed\n");
        } else {
            printf("Failed\n");
        }

        // Test 2: Introduce one bit error randomly
        int error_position = rand() % packet.len;
        packet.data[error_position] ^= 1; // Flip one bit
        printf("Test %d: Introduce one bit error - ", i + 1);
        if (!checksum_validate(&packet)) {
            printf("Passed\n");
        } else {
            printf("Failed\n");
        }

        // Test 3: Introduce two bits of errors on different bit positions
        int error_position1 = rand() % packet.len;
        int error_position2;
        do {
            error_position2 = rand() % packet.len;
        } while (error_position2 == error_position1);

        packet.data[error_position1] ^= 1; // Flip one bit
        packet.data[error_position2] ^= 1; // Flip another bit
        printf("Test %d: Introduce two bits of errors - ", i + 1);
        if (!checksum_validate(&packet)) {
            printf("Passed\n");
        } else {
            printf("Failed\n");
        }

        // Test 4: Introduce two errors at the same bit position
        packet.data[error_position1] ^= 1; // Flip the same bit again
        printf("Test %d: Introduce two errors at the same bit position - ", i + 1);
        if (checksum_validate(&packet)) {
            printf("Passed\n");
        } else {
            printf("Failed\n");
        }

        printf("\n");
    }

    return 0;
}