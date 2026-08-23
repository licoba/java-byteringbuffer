package com.daniel_araujo.byteringbuffer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ByteRingBufferConstructorTest {
    @Test
    public final void acceptsPositiveCapacity() {
        ByteRingBuffer buffer = new ByteRingBuffer(1);

        assertEquals(1, buffer.sizeTotal());
    }

    @Test(expected = IllegalArgumentException.class)
    public final void rejectsZeroCapacity() {
        new ByteRingBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public final void rejectsNegativeCapacity() {
        new ByteRingBuffer(-1);
    }
}
