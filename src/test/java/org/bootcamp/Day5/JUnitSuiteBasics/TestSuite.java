package org.bootcamp.Day5.JUnitSuiteBasics;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MathTest.class, SquareTest.class, ExampleTest.class})
//@SelectPackages("org.bootcamp.Day5.JUnitSuiteBasics")
public class TestSuite {
}
