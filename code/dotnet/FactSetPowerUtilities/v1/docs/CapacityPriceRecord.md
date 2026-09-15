# FactSet.SDK.FactSetPowerUtilities.Model.CapacityPriceRecord
Capacity auction clearing price record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**LocationId** | **string** | Location identifier, as submitted in the request. | 
**LocationName** | **string** | Full location name. | [optional] 
**IsoCode** | **string** | ISO/TSO market code. | [optional] 
**Category** | **CategoryCapacity** |  | 
**Mnemonic** | **string** | FactSet-assigned code for this price series. | [optional] 
**AuctionType** | **string** | Type of capacity auction. | [optional] 
**AuctionDate** | **DateTime?** | Date of the capacity auction. | [optional] 
**DeliveryYear** | **int?** | Capacity delivery year, derived from the price effective date. | [optional] 
**AuctionPriceMw** | **double?** | Capacity auction clearing price in $/MW-day. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

