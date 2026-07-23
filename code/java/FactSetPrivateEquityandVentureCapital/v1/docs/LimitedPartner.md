

# LimitedPartner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factsetLpEntityId** | **String** | FactSet identifier for the limited partner |  [optional]
**lpName** | **String** | Limited partner name |  [optional]
**commitDate** | **LocalDate** | Date of commitment |  [optional]
**commitAmount** | **BigDecimal** | Commitment amount in reporting currency |  [optional]
**commitAmountUsd** | **BigDecimal** | Commitment amount in USD |  [optional]
**revisedCommit** | **Integer** | Revised commitment amount if changed |  [optional]
**currency** | **String** | Currency of the commitment |  [optional]
**fundraiseCloseCode** | [**FundraiseCloseCodeEnum**](#FundraiseCloseCodeEnum) | Associated fundraising close |  [optional]



## Enum: FundraiseCloseCodeEnum

Name | Value
---- | -----
UNKNOWN_CLOSE | &quot;Unknown Close&quot;
FIRST_CLOSE | &quot;First Close&quot;
TENTH_CLOSE | &quot;Tenth Close&quot;
SECOND_CLOSE | &quot;Second Close&quot;
THIRD_CLOSE | &quot;Third Close&quot;
FOURTH_CLOSE | &quot;Fourth Close&quot;
FIFTH_CLOSE | &quot;Fifth Close&quot;
SIXTH_CLOSE | &quot;Sixth Close&quot;
SEVENTH_CLOSE | &quot;Seventh Close&quot;
EIGHTH_CLOSE | &quot;Eighth Close&quot;
NINTH_CLOSE | &quot;Ninth Close&quot;
NULL | &quot;null&quot;


## Implemented Interfaces

* Serializable


