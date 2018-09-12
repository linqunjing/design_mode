package 行为型模式.状态模式;

class Rain implements Weather {
    @Override
    public String getWeather() {
        return "下雨";
    }
}
