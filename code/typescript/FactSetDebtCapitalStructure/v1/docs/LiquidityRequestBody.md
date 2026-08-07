# factsetdebtcapitalstructure.LiquidityRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Maximum of 25 IDs are supported.  | 
**startDate** | **Date** | The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**term** | [**Term**](Term.md) |  | [optional] 
**metrics** | **[String]** | Requested List of Financial Statement Items or Ratios.  | 


