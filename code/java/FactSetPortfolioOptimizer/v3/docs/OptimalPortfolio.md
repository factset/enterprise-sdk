

# OptimalPortfolio


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acctName** | **String** | Account path |  [optional]
**excludeZero** | **Boolean** | Exclude zero |  [optional]
**archiveDate** | **String** | Archive date |  [optional]
**ifAcctExists** | [**IfAcctExistsEnum**](#IfAcctExistsEnum) | Archive action if account exists |  [optional]
**ifOfdbDateExists** | [**IfOfdbDateExistsEnum**](#IfOfdbDateExistsEnum) | Action if ofdb date exists |  [optional]



## Enum: IfAcctExistsEnum

Name | Value
---- | -----
ABORT | &quot;abort&quot;
OVERWRITE | &quot;overwrite&quot;
APPENDDATE | &quot;appendDate&quot;



## Enum: IfOfdbDateExistsEnum

Name | Value
---- | -----
ABORT | &quot;abort&quot;
REPLACEDATE | &quot;replaceDate&quot;
APPENDSECURITIES | &quot;appendSecurities&quot;


## Implemented Interfaces

* Serializable


