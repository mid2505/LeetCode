// Problem: Design Ride Sharing System
// Language: java

class RideSharingSystem {
    LinkedList<Integer> rider;
    LinkedList<Integer> driver;
    public RideSharingSystem() {
        rider = new LinkedList<>();
        driver = new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        rider.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(rider.size()!=0 && driver.size()!=0){
            return new int[]{driver.poll(),rider.poll()};
        }
        else{
            return new int[]{-1,-1};
        }
    }
    
    public void cancelRider(int riderId) {
        Integer r = riderId;
        if(rider.contains(r)) rider.remove(r);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */