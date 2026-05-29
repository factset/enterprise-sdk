# factsetprivateequityandventurecapital.IPODetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **Number** | Requested Deal ID | [optional] 
**ipoId** | **Number** | IPO identifier associated with the pevc backed company | [optional] 
**factsetPortCoEntityId** | **String** | Portfolio company identifier | [optional] 
**portfolioCompanyName** | **String** | Portfolio company name | [optional] 
**tickerSymbol** | **String** | Trading ticker symbol | [optional] 
**tradeDate** | **Date** | First trading date | [optional] 
**closeDate** | **Date** | IPO closing date | [optional] 
**offerPrice** | **Number** | IPO offer price | [optional] 
**offerPriceUsd** | **Number** | IPO offer price in USD | [optional] 
**exchangeDate** | **Date** | The exchange date used for conversion of the local to USD | [optional] 
**ipoSize** | **Number** | Gross proceeds, including overallotment, expressed in millions of the issuer&#39;s currency | [optional] 
**currency** | **String** | ISO Currency of the Issuer (Portfolio Company) | [optional] 
**ipoStatus** | **String** | Status of the IPO transaction | [optional] 
**announcementDate** | **Date** | IPO announcement date | [optional] 
**pricingDate** | **Date** | IPO pricing date | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 



## Enum: IpoStatusEnum


* `Closed` (value: `"Closed"`)

* `Announced` (value: `"Announced"`)

* `Postponed` (value: `"Postponed"`)

* `Cancelled` (value: `"Cancelled"`)

* `Priced` (value: `"Priced"`)

* `Withdrawn` (value: `"Withdrawn"`)

* `In Registration` (value: `"In Registration"`)




