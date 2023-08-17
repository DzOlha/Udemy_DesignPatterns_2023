package behavioral.nullObject.codeNullObjectTask.model.log;

import behavioral.nullObject.codeNullObjectTask.model.log.Log;

public class NullLog implements Log {
    private int c = 0;

    @Override
    public int getRecordLimit() {
        return getRecordCount() * 2;
    }

    @Override
    public int getRecordCount() {
        return c;
    }

    @Override
    public void logInfo(String message) {
        c++;
    }
}
