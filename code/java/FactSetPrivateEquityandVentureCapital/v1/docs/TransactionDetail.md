

# TransactionDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **Integer** | Unique identifier of the respective transaction used in request |  [optional]
**factsetPortCoEntityId** | **String** | Portfolio company entity ID |  [optional]
**portfolioCompanyName** | **String** | Portfolio company name |  [optional]
**investmentType** | **String** | Investment type of the transaction |  [optional]
**status** | **String** | Status of the transaction |  [optional]
**announcementDate** | **LocalDate** | Date transaction was announced |  [optional]
**closeDate** | **LocalDate** | Date transaction closed |  [optional]
**financial** | [**TransactionDetailFinancial**](TransactionDetailFinancial.md) |  |  [optional]
**details** | [**TransactionDetailDetails**](TransactionDetailDetails.md) |  |  [optional]
**investors** | [**java.util.List&lt;TransactionInvestor&gt;**](TransactionInvestor.md) |  |  [optional]
**securities** | [**java.util.List&lt;TransactionSecurity&gt;**](TransactionSecurity.md) |  |  [optional]
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  |  [optional]


## Implemented Interfaces

* Serializable


