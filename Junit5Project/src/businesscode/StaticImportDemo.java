package businesscode;
import static java.lang.Math.*;
import static java.lang.System.*;
/*
 * In Java, static import concept is introduced in 1.5 version. With the help of static import, we can access the static members of a class directly without class name or any object.
 */

public class StaticImportDemo {

	public static void main(String[] args) {
		//Without Static Import
		/*System.out.println(Math.sqrt(55));
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.abs(55.55));
*/
		//with static import of System & Math class
		out.println(sqrt(55));
		out.println(pow(10,2));
		out.println(abs(55.55));
	}

}
