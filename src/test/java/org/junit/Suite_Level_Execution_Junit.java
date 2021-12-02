package org.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith (Suite.class)
@Suite.SuiteClasses ({Class1_Junit.class,Utilization_Adactin_Junit.class,Class2_Junit.class})
//Order of Execution of Classes / Test cases is based on order of Classes given in Suite Case

public class Suite_Level_Execution_Junit {

}
