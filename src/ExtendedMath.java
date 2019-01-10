public class ExtendedMath {
  public static float normalizeRadians(float radians) {
    // should take in any number of radians, and output the
    //equivalent in the range [-pi, pi]
    // do NOT use a loop.
    // hint: maybe make another function called normalizeRadians2pi which normalizes to [0, 2pi] first
    if(radians < -1){
    	return (radians * -1) - 1;
  	}
   	else if(radians > 1){
   		return 1 - ((radians * -1) % 1);
    }
   	else{
    	return radians;
    }
  }
}
