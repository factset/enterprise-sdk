

# IPOSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipoId** | **Integer** | IPO identifier |  [optional]
**factsetPortCoEntityId** | **String** | Portfolio company identifier |  [optional]
**portfolioCompanyName** | **String** | Portfolio company name |  [optional]
**tickerSymbol** | **String** | Trading ticker symbol |  [optional]
**tradeDate** | **LocalDate** | First trading date |  [optional]
**offerPriceUsd** | **BigDecimal** | IPO offer price in USD |  [optional]
**ipoSize** | **BigDecimal** | Gross proceeds, including overallotment, expressed in millions of the issuer&#39;s currency |  [optional]
**ipoStatus** | [**IpoStatusEnum**](#IpoStatusEnum) | Status of the IPO transaction |  [optional]



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


