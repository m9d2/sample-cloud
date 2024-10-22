package sample.cloud.common.enums;

public enum ServiceNameEnum {
    BASE_SERVICE("sample-cloud-service-base"),
    ORDER_SERVICE("sample-cloud-service-order");

    private final String value;

    ServiceNameEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
