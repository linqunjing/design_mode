package 行为型模式.状态模式;

class Context {
    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String weatherMessage(){
        return weather.getWeather();
    }
}
