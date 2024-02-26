package q_1603_DesignParkingSystem;

/*
Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.

Implement the ParkingSystem class:

ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class. 
The number of slots for each parking space are given as part of the constructor.
bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot. 
carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. 
A car can only park in a parking space of its carType. 
If there is no space available, return false, else park the car in that size space and return true.
*/

/*
Constraints:

0 <= big, medium, small <= 1000
carType is 1, 2, or 3
At most 1000 calls will be made to addCar
*/

class ParkingSystem {
	int[] bigSlots;
	int[] mediumSlots;
	int[] smallSlots;

	public ParkingSystem(int big, int medium, int small) {
		bigSlots = new int[big];
		mediumSlots = new int[medium];
		smallSlots = new int[small];
	}

	public boolean addCar(int carType) {
		if (carType == 1) {
			for (int i = 0; i < bigSlots.length; i++) {
				if (bigSlots[i] == 0) {
					bigSlots[i] = 1;
					return true;
				}
			}
			return false;
		}
		if (carType == 2) {
			for (int i = 0; i < mediumSlots.length; i++) {
				if (mediumSlots[i] == 0) {
					mediumSlots[i] = 1;
					return true;
				}
			}
			return false;
		}
		if (carType == 3) {
			for (int i = 0; i < smallSlots.length; i++) {
				if (smallSlots[i] == 0) {
					smallSlots[i] = 1;
					return true;
				}
			}
			return false;
		}
		return false;
	}
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small); boolean param_1 =
 * obj.addCar(carType);
 */
