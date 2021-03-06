package org.elasticsearch.action.autotagging;

import java.io.IOException;

import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.io.stream.StreamOutput;

public class AutoTaggingResponse extends AcknowledgedResponse {

    public AutoTaggingResponse() {
    }

    public AutoTaggingResponse(boolean acknowledged) {
        super(acknowledged);
    }

    @Override
    public void readFrom(StreamInput in) throws IOException {
        super.readFrom(in);
        readAcknowledged(in, null);
    }

    @Override
    public void writeTo(StreamOutput out) throws IOException {
        super.writeTo(out);
        writeAcknowledged(out, null);
    }

}
