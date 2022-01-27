# factsetetf.EtfReferenceDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | List of ETF identifiers. | 
**metrics** | **[String]** | List of data items for Exchange Traded Funds. To fetch a list of all available data items, use the **_/metrics** endpoint.  | [optional] 
**categories** | [**[Category]**](Category.md) | Selects the ETF metrics by category -   |category|description|   |---|---|   |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark|   |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.|   |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.|   |COUNTERPARTY|Credit and Swap Counterparty details|   |CREATE_REDEEM|Creation and Redemption Sizes|   |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.|   |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains|   |DOCUMENTATION|Details surrounding reporting information.|   |GEARING|Leverage factors, inverse flags, and more.|   |HEDGE|Hedging Information|   |RISK|CIFSC Risk Ratings|   |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details|   |STATUS|Actively Managed Flags|   |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.|   |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.|   |TAX|Tax Types, distribution takes, K1 Flags, and more.|  | [optional] 


