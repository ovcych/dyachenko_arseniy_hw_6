public class Skeleton extends Boss {
    public int arrowCount;
    public int getArrowCount() {
        return arrowCount;
    }
    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }
    @Override
    public String printInfo() {
        return super.printInfo() + "\n" +
                "Arrow Count: " + arrowCount;
    }
}
