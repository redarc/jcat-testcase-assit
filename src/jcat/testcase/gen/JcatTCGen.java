package jcat.testcase.gen;

public class JcatTCGen
{
  protected static String nl;
  public static synchronized JcatTCGen create(String lineSeparator)
  {
    nl = lineSeparator;
    JcatTCGen result = new JcatTCGen();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import org.testng.annotations.*;" + NL + "import se.ericsson.jcat.fw.annotations.*;" + NL + "import com.ericsson.tac.jcat.TestBase;" + NL + "import com.ericsson.ate.*;" + NL + "import com.ericsson.msr.*;" + NL + "" + NL + "/**" + NL + "* @id  ";
  protected final String TEXT_3 = NL + "*" + NL + "* @name ";
  protected final String TEXT_4 = NL + "*" + NL + "* @author " + NL + "*" + NL + "* @created " + NL + "*" + NL + "* @modified " + NL + "*" + NL + "* @revision " + NL + "*" + NL + "* @description  This test uses the {@link ";
  protected final String TEXT_5 = "ModuleBuilder} to configure and build a" + NL + "*       {@link ";
  protected final String TEXT_6 = "Module}. Then the test modules execute(test) method is executed." + NL + "*" + NL + "* @precondition Requires the hardware described in {@link ";
  protected final String TEXT_7 = "TestModule}" + NL + "*/" + NL + "" + NL + "public class ";
  protected final String TEXT_8 = " extends TestBase" + NL + "{" + NL + "    public ";
  protected final String TEXT_9 = "(){" + NL + "\tsetTestInfo(\"Constructor of ";
  protected final String TEXT_10 = "\");" + NL + "\t}" + NL + "\t" + NL + "\t@Setup" + NL + "    public void setup() {" + NL + "        setTestInfo(\"****setup\");" + NL + "    }" + NL + "" + NL + "    @Teardown" + NL + "    public void teardown() {" + NL + "        setTestInfo(\"****teardown\");" + NL + "    }" + NL + "    " + NL + "    /**" + NL + "     * Tests ";
  protected final String TEXT_11 = " using {@link ";
  protected final String TEXT_12 = "Module}." + NL + "     *" + NL + "     * @param testId                         - The test \"ID\", use the CTC if available.<br>" + NL + "     * @param description                    - The description of test.<br>" + NL + "     * @param duration                       - The time of test would be executed" + NL + "     * @param ue_TotalNumber                 - Sets the total number of UEs would be used.<br>" + NL + "     * @param ue_TputNumber                  - Sets number of UEs would be used for doing Throughput.<br>" + NL + "     * @param servingEUtranCell              - Sets which cell of eNoteB would be used.<br>" + NL + "     */" + NL + "     " + NL + "    @Parameters({\"testid\",\"description\", \"duration\", \"ue_TotalNumber\", \"ue_TputNumber\",\"servingEUtranCell\"})" + NL + "    " + NL + "    @Test" + NL + "    public void test (String testId,String description, int duration,int ue_TotalNumber, int ue_TputNumber, String servingEUtranCell) throws Exception {";
  protected final String TEXT_13 = NL + "        ";
  protected final String TEXT_14 = "Module testModule = ";
  protected final String TEXT_15 = "Module.newBuilder()" + NL + "            .setTestId(testId)" + NL + "            .setDescription(description)" + NL + "            .setTotalNumOfUes(ue_TotalNumber)" + NL + "            .setTputNumOfUes(ue_TputNumber)" + NL + "            .setNumOfCells(servingEUtranCell)" + NL + "            .build(); //Build a new instance of the test module." + NL + "        testModule.execute();" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	JcatTCGenArgs args = (JcatTCGenArgs)argument;
    String pkgName = args.getPkgName();
    String className = args.getClassName();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(pkgName);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
