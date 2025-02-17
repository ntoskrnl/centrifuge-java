package io.github.centrifugal.centrifuge;

public class TokenError extends Throwable {
    private final Throwable error;

    TokenError(Throwable error) {
        this.error = error;
    }

    public Throwable getError() {
        return error;
    }
}
