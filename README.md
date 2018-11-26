# refactoring_step_by_step

1. Create test case check_if_driver_age_is_legal_to_drive() in PoliceTest.
- 1.1 Test the program if it is correct

2. Create a getter getAge() in Driver Class
- 2.1 Change driver.age -> driver.getAge() in Police Class
- 2.2 Run test case check_if_driver_age_is_legal_to_drive() if it is correct

3. Change public int age -> private int age in Driver Class
- 3.1 Run test case check_if_driver_age_is_legal_to_drive() if it is correct

4. Highlight checkDriver() in Police Class and Right click Refactor
- 4.1 Then select rename
- 4.2 Change checkDriver() -> checkDriverAge()
- 4.3 Run test case check_if_driver_age_is_legal_to_drive() if it is correct
