package db;

import java.io.Serial;

public class DbException extends RuntimeException {

    // This is the first version | Essa é a primeira versão
    @Serial
    private static final long serialVersionUID = 1L;

    public DbException(String msg) {
        super(msg);
    }

}
