module com.tugalsan.api.random {
    requires com.tugalsan.api.hex;
    requires com.tugalsan.api.shape;
    requires com.tugalsan.api.unsafe;
    requires com.tugalsan.api.function;
    exports com.tugalsan.api.random.client;
    exports com.tugalsan.api.random.server;
}
