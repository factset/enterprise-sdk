

# TransactionDetailDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roundOfFunding** | **String** | Funding round designation |  [optional]
**stage** | **String** | The stage type of the transaction |  [optional]
**numBackingInvestors** | **Integer** | Number of investors in round |  [optional]
**isAssumed** | **Boolean** | Whether transaction details are assumed |  [optional]
**synopsis** | **String** | Transaction synopsis |  [optional]
**securityNote** | **String** | Security details and terms |  [optional]
**securityCodesUsed** | [**java.util.List&lt;SecurityCodesUsedEnum&gt;**](#java.util.List&lt;SecurityCodesUsedEnum&gt;) | Transaction security type |  [optional]



## Enum: java.util.List&lt;SecurityCodesUsedEnum&gt;

Name | Value
---- | -----
COMMON_STOCK | &quot;Common Stock&quot;
PREFERRED_STOCK | &quot;Preferred Stock&quot;
CONVERTIBLE_EXCHANGEABLE_BOND | &quot;Convertible/Exchangeable Bond&quot;
WARRANT | &quot;Warrant&quot;
PRODUCT | &quot;Product&quot;
MEZZANINE | &quot;Mezzanine&quot;
SAFE | &quot;SAFE&quot;


## Implemented Interfaces

* Serializable


