/*******************************************************************************
 * Copyright (c) 2014, MD PnP Program
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package drivers.philips.intellivue.association.impl;

import drivers.philips.intellivue.association.AssociationAbort;
import drivers.philips.intellivue.association.AssociationMessageType;

/**
 * @author Jeff Plourde
 *
 */
public class AssociationAbortImpl extends AbstractAssociationMessage implements AssociationAbort {

    @Override
    public AssociationMessageType getType() {
        return AssociationMessageType.Abort;
    }

    private static final byte[] PRESENTATION_HEADER = new byte[] { (byte) 0xA0, (byte) 0x80, (byte) 0xA0, (byte) 0x80, 0x30, (byte) 0x80, 0x02, 0x01,
            0x01, 0x06, 0x02, 0x51, 0x01, 0x00, 0x00, 0x00, 0x00, 0x61, (byte) 0x80, 0x30, (byte) 0x80, 0x02, 0x01, 0x01, (byte) 0xA0, (byte) 0x80,
            0x64, (byte) 0x80, (byte) 0x80, 0x01, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    private static final byte[] PRESENTATION_TRAILER = new byte[] { 0x00, 0x00, 0x00, 0x00 };

    @Override
    public byte[] getPresentationHeader() {
        return PRESENTATION_HEADER;
    }

    @Override
    public byte[] getPresentationTrailer() {
        return PRESENTATION_TRAILER;
    }

}
