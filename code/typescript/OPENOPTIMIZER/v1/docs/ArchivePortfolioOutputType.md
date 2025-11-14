# openoptimizer.ArchivePortfolioOutputType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountName** | **String** | Account path | [optional] 
**excludeZeroShares** | **Boolean** | Exclude zero | [optional] 
**archiveDate** | **String** | Archive date in YYYY-MM-DD format | [optional] 
**ifAccountExists** | **String** | Archive action if account exists | [optional] 
**ifOFDBDateExists** | **String** | Action if ofdb date exists | [optional] 



## Enum: IfAccountExistsEnum


* `abort` (value: `"abort"`)

* `overwrite` (value: `"overwrite"`)

* `appendDate` (value: `"appendDate"`)





## Enum: IfOFDBDateExistsEnum


* `abort` (value: `"abort"`)

* `replaceDate` (value: `"replaceDate"`)

* `appendSecurities` (value: `"appendSecurities"`)




