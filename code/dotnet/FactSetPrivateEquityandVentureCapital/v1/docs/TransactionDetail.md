# FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model.TransactionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **int?** | Unique identifier of the respective transaction used in request | [optional] 
**FactsetPortCoEntityId** | **string** | Portfolio company entity ID | [optional] 
**PortfolioCompanyName** | **string** | Portfolio company name | [optional] 
**InvestmentType** | **string** | Investment type of the transaction | [optional] 
**Status** | **string** | Status of the transaction | [optional] 
**AnnouncementDate** | **DateTime?** | Date transaction was announced | [optional] 
**CloseDate** | **DateTime?** | Date transaction closed | [optional] 
**Financial** | [**TransactionDetailFinancial**](TransactionDetailFinancial.md) |  | [optional] 
**Details** | [**TransactionDetailDetails**](TransactionDetailDetails.md) |  | [optional] 
**Investors** | [**List&lt;TransactionInvestor&gt;**](TransactionInvestor.md) |  | [optional] 
**Securities** | [**List&lt;TransactionSecurity&gt;**](TransactionSecurity.md) |  | [optional] 
**Error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

