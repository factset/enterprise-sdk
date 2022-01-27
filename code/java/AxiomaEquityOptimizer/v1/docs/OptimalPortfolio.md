

# OptimalPortfolio


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acctname** | **String** | Account path |  [optional]
**excludezero** | **Boolean** | Exclude zero |  [optional]
**archivedate** | **String** | Archive date |  [optional]
**ifacctexists** | [**IfacctexistsEnum**](#IfacctexistsEnum) | Archive action if account exists |  [optional]
**ifofdbdateexists** | [**IfofdbdateexistsEnum**](#IfofdbdateexistsEnum) | Action if ofdb date exists |  [optional]



## Enum: IfacctexistsEnum

Name | Value
---- | -----
ABORT | &quot;abort&quot;
OVERWRITE | &quot;overwrite&quot;
APPENDDATE | &quot;appenddate&quot;



## Enum: IfofdbdateexistsEnum

Name | Value
---- | -----
ABORT | &quot;abort&quot;
REPLACEDATE | &quot;replacedate&quot;
APPENDSECURITIES | &quot;appendsecurities&quot;


## Implemented Interfaces

* Serializable


