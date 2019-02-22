//import static org.testng.AssertJUnit.assertThat;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
//import static org.hamcrest.core.Is.is;

import test.TestNg;

public class NewTest {
	TestNg a=new TestNg();
	  double d=Double.POSITIVE_INFINITY;
	  double n=Double.NaN;
  @Test
  public void addTest() {
	 // assertThat(5, is(equalTo(a.sum(2, 3))));
	  assertThat(a.sum(2, 3)).isEqualTo(5);
	  assertThat(a.sum(5, 5)).isEqualTo(10);
	  assertThat(a.sum(d, 4)).isEqualTo(d);
	  assertThat(a.sum(d, d)).isEqualTo(d);
	  
  }
  @Test
  public void subTest(){
	  assertThat(a.sub(3, 5)).isEqualTo(-2);
	  assertThat(a.sub(d, 5)).isEqualTo(d);
	  assertThat(a.sub(5, d)).isEqualTo(-d);
	  assertThat(a.sub(0, 5)).isEqualTo(-5);
	  assertThat(a.sub(d, d)).isEqualTo(n);
	  
  } @Test
  public void mulTest(){
	  assertThat(a.mul(2, 5)).isEqualTo(10);
	  assertThat(a.mul(-2, 5)).isEqualTo(-10);
	  assertThat(a.mul(-2, -5)).isEqualTo(10);
	  assertThat(a.mul(d, -5)).isEqualTo(-d);
	  assertThat(a.mul(0, 5)).isEqualTo(0);
	  assertThat(a.mul(d, d)).isEqualTo(d);
	  
  }
  @Test
  public void divTest(){
	  assertThat(a.div(2, 0)).isEqualTo(d);
	  assertThat(a.div(d, d)).isEqualTo(n);
	  assertThat((int)a.div(20, 3)).isEqualTo(6);
	  assertThat((int)a.div(-20, 3)).isEqualTo(-6);
	  
	 
	  
	  
	  
	  
	  
	  
  }
}
