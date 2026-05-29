

# IPODetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **Integer** | Requested Deal ID |  [optional]
**ipoId** | **Integer** | IPO identifier associated with the pevc backed company |  [optional]
**factsetPortCoEntityId** | **String** | Portfolio company identifier |  [optional]
**portfolioCompanyName** | **String** | Portfolio company name |  [optional]
**tickerSymbol** | **String** | Trading ticker symbol |  [optional]
**tradeDate** | **LocalDate** | First trading date |  [optional]
**closeDate** | **LocalDate** | IPO closing date |  [optional]
**offerPrice** | **BigDecimal** | IPO offer price |  [optional]
**offerPriceUsd** | **BigDecimal** | IPO offer price in USD |  [optional]
**exchangeDate** | **LocalDate** | The exchange date used for conversion of the local to USD |  [optional]
**ipoSize** | **BigDecimal** | Gross proceeds, including overallotment, expressed in millions of the issuer&#39;s currency |  [optional]
**currency** | **String** | ISO Currency of the Issuer (Portfolio Company) |  [optional]
**ipoStatus** | [**IpoStatusEnum**](#IpoStatusEnum) | Status of the IPO transaction |  [optional]
**announcementDate** | **LocalDate** | IPO announcement date |  [optional]
**pricingDate** | **LocalDate** | IPO pricing date |  [optional]
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  |  [optional]



## Enum: IpoStatusEnum

Name | Value
---- | -----
CLOSED | &quot;Closed&quot;
ANNOUNCED | &quot;Announced&quot;
POSTPONED | &quot;Postponed&quot;
CANCELLED | &quot;Cancelled&quot;
PRICED | &quot;Priced&quot;
WITHDRAWN | &quot;Withdrawn&quot;
IN_REGISTRATION | &quot;In Registration&quot;


## Implemented Interfaces

* Serializable


