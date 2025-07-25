

# InlineResponse200DataSettlement

Settlement details (type and EOD price).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Settlement type of the option. | Value | Description | | --- | --- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. |   |  [optional]
**price** | **BigDecimal** | Settlement price. |  [optional]
**currency** | [**InlineResponse200DataSettlementCurrency**](InlineResponse200DataSettlementCurrency.md) |  |  [optional]
**time** | **OffsetDateTime** | Date and time. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CASH | &quot;cash&quot;
PHYSICAL | &quot;physical&quot;


## Implemented Interfaces

* Serializable


