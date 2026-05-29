

# FundraisingRound


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundraiseCloseCode** | [**FundraiseCloseCodeEnum**](#FundraiseCloseCodeEnum) | Fundraising close type code |  [optional]
**closeDate** | **LocalDate** | Date of the fundraising close |  [optional]
**originalTargetAmount** | **BigDecimal** | Minimum amount expected by the GP to raise for a fund |  [optional]
**originalTargetAmountUsd** | **BigDecimal** | The amount of funds that the fund intends to raise. The value is expressed in U.S. Dollars in millions. Target Amount reporting in a currency other than U.S. Dollars are converted as of the original target date. |  [optional]
**revisedTargetAmount** | **BigDecimal** | Revised target amount |  [optional]
**revisedTargetAmountUsd** | **BigDecimal** | Refers to a change in the original target size or amount of funds that the fund intends to raise. The value is expressed in U.S. Dollars in millions. Revised Target Amount reporting in a currency other than U.S. Dollars are converted as of the revised target date. |  [optional]
**originalTargetDate** | **LocalDate** | Date the GP expects the minimum target to be raised |  [optional]
**revisedTargetDate** | **LocalDate** | Date the target amount is revised |  [optional]
**targetMin** | **BigDecimal** | Minimum fundraising target |  [optional]
**targetMax** | **BigDecimal** | Maximum fundraising target |  [optional]
**minMaxTargetDate** | **LocalDate** | Target date for min/max range |  [optional]
**fundraiseAmountRaised** | **BigDecimal** | Amount raised in this close |  [optional]
**finalClose** | **Boolean** | Whether this is the final close |  [optional]
**currency** | **String** | Currency of the amounts |  [optional]



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


## Implemented Interfaces

* Serializable


