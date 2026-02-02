class confgsFactory {

    static LoadConfgs create(ConfgType configType) {
        return switch(configType){
            case Properties -> new PropertiesConfigLoader();
            default -> throw new IllegalArgumentException(configType.name() + " is not supported");
        };

}
}
