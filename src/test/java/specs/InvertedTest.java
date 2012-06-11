package specs;

import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

public class InvertedTest extends SpecTest {

  public InvertedTest(final Spec spec) {
    super(spec);
  }

  @Parameters
  public static Collection<Object[]> data() {
    return data("inverted.yml");
  }
}
