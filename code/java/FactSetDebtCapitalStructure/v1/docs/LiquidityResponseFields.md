

# LiquidityResponseFields

Liquidity Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**fysmId** | **String** | Identifier that was used for the request. |  [optional]
**metric** | **String** | The requested &#x60;metric&#x60; input, representing the Liquidity data item. For a definition of the item please use the &#x60;/metrics&#x60; endpoint. |  [optional]
**fiscalYear** | **Integer** | Fiscal year of the reported period in YYYY format. |  [optional]
**reportDate** | **LocalDate** | Reporting date for the debt instrument. |  [optional]
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**value** | [**LiquidityValue**](LiquidityValue.md) |  |  [optional]
**instrumentId** | **String** | Identifier for the debt instrument. |  [optional]
**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | Type of debt instrument. |  [optional]
**description** | **String** | Description of the debt instrument. |  [optional]
**amountOutstanding** | **BigDecimal** | Balance sheet amount outstanding. |  [optional]
**facilityAmount** | **BigDecimal** | Facility Amount for liquidity. |  [optional]
**borrowingBase** | **BigDecimal** | Borrowing Base for liquidity. |  [optional]
**maturityDate** | **LocalDate** | Maturity date for the debt instrument. |  [optional]



## Enum: InstrumentTypeEnum

Name | Value
---- | -----
REVOLVING_CREDIT | &quot;Revolving Credit&quot;
TERM_LOANS | &quot;Term Loans&quot;
ST_DEBT_TOTAL | &quot;ST Debt Total&quot;
NOTES_BONDS | &quot;Notes/Bonds&quot;
OTHER | &quot;Other&quot;


## Implemented Interfaces

* Serializable


