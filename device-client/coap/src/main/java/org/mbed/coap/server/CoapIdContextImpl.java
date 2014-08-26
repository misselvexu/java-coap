/**
 * Copyright (C) 2011-2014 ARM Limited. All rights reserved.
 */
package org.mbed.coap.server;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class CoapIdContextImpl implements CoapIdContext {

    private AtomicInteger globalMid = new AtomicInteger(new Random().nextInt(0xFFFF));

    @Override
    public int getNextMID() {
        return 0xFFFF & (globalMid.incrementAndGet());
    }
}