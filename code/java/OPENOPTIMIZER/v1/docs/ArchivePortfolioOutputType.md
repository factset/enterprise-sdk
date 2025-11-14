

# ArchivePortfolioOutputType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountName** | **String** | Account path |  [optional]
**excludeZeroShares** | **Boolean** | Exclude zero |  [optional]
**archiveDate** | **String** | Archive date in YYYY-MM-DD format |  [optional]
**ifAccountExists** | [**IfAccountExistsEnum**](#IfAccountExistsEnum) | Archive action if account exists |  [optional]
**ifOFDBDateExists** | [**IfOFDBDateExistsEnum**](#IfOFDBDateExistsEnum) | Action if ofdb date exists |  [optional]



## Enum: IfAccountExistsEnum

Name | Value
---- | -----
ABORT | &quot;abort&quot;
OVERWRITE | &quot;overwrite&quot;
APPENDDATE | &quot;appendDate&quot;



## Enum: IfOFDBDateExistsEnum

Name | Value
---- | -----
ABORT | &quot;abort&quot;
REPLACEDATE | &quot;replaceDate&quot;
APPENDSECURITIES | &quot;appendSecurities&quot;


## Implemented Interfaces

* Serializable


