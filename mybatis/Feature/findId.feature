@tag
Feature: Test getUserById function of UserDao
@tag1
Scenario: By ID find User
Given init UserDaoMapper
When apply ID
Then print User
And close session