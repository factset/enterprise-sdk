# TaxesAndRisksItem

Response item that can be one of: RegulationsTaxDetails, TaxExposure, or RiskMeasures. The actual schema depends on the `taxItemsType` parameter. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax_items_type** | [**RiskMeasuresType**](RiskMeasuresType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**regulatory_authority** | **str, none_type** | The regulatory authority supervising the fund or umbrella. Data is returned for Mutual Funds only. Possible values include—     SEC, CONSOB, FCMC, CSSF, MFSA, AFM, NFSA, ASF, CNMV, FINMA, FCA, FRC, JFSC, FI (SE),   FIN-FSA, GFSC, FMA (LI), NBS, FME, MNB, CMB, FMA (AT), FMA (AU), SFSA, HANFA, EFSA,   ATVP, CNB, CMB, CMVM, KNF, CIMA, CCAF, FSMA, COVIP, IOMFSA, FI (EE), DFSA, AMF,   BaFin, HCMC, CBI  | [optional] 
**ucits_scheme** | **str, none_type** | Determines whether the fund is regulated under the UCITS IV (Directive 2009/65/EC) or UCITS V (Directive 2014/91/EU). Data is returned for Mutual Funds only. | [optional] 
**ucits_compliance** | **bool, none_type** | Determines whether the fund is regulated under the UCITS IV (Directive 2009/65/EC) or UCITS V (Directive 2014/91/EU). Data is returned for Mutual Funds only. | [optional] 
**priips_eligible** | **bool, none_type** | Indicates if the fund has a published Key Information Document (KID) in the fund website. Data is returned for Mutual Funds only. | [optional] 
**tax_reporting_status_uk** | **bool, none_type** | UK Tax Reporting indicates if a fund has UK fund tax status which enables approved shares to provide favorable tax rates on any gain upon disposal of investor&#39;s investments. Data is returned for both Mutual Funds and ETFs. | [optional] 
**srd_compliance_fr** | **bool, none_type** | Returns &#39;True&#39; if the fund is eligible for Deferred Settlement Service or Service à Réglement Différé (SRD) in France. Data is returned for Mutual Funds only. | [optional] 
**isa_uk_compliant** | **bool, none_type** | UK ISA Compliance indicates whether the fund is included in the UK ISA (Individual Savings Account) in-house tax free saving scheme. Data is returned for both Mutual Funds and ETFs | [optional] 
**pea_eligible_fr** | **bool, none_type** | Returns &#39;True&#39; if the fund is eligible for the Plan d&#39;Epargne en Action (PEA) or “shared savings plan” in France.It is a regulated savings product that allows the purchase of European equities or funds without capitalization constraints.Data is returned for Mutual Funds only. | [optional] 
**nav_frequency** | **str, none_type** | Returns frequency at which the NAV is calculated. Data is returned for Mutual Funds only. | [optional] 
**transaction_cut_off_time** | **str, none_type** | Returns the cut off time for transactions. The value is provided as a time string in the format \&quot;HH:mm z\&quot;,  where HH:mm is the hour and minute, and z is the timezone abbreviation (e.g., \&quot;12:00 GMT\&quot;).  | [optional] 
**esg_objective** | **bool, none_type** | Determine if the fund is ESG compliant or not and returns the fund&#39;s ESG classification. | [optional] 
**sfdr_classification** | **str, none_type** | Determines if the fund is ESG compliant and returns the fund&#39;s ESG classification according to the Sustainable Finance Disclosure Regulation (SFDR). Possible values:   - Article 8: Preferences for products having ESG Characteristics.   - Article 9: Preferences for products having Sustainable Objectives.   - Article 6: Fund is not ESG but makes disclosures on the integration of sustainable risks.   - Article 0: The type or structure of the fund is out of ESG requirements.   - NA:- No information available. Data is returned for both Mutual Funds and ETFs.  | [optional] 
**uk_sdr** | **str, none_type** | Returns the fund&#39;s UK SDR. Data is returned for both Mutual Funds and ETFs | [optional] 
**available_for_sale_in** | **[str], none_type** | Returns where the fund is available for sale. Data is returned for both Mutual Funds and ETFs. Each entry is an ISO 3166-1 alpha-2 country code. | [optional] 
**capital_gains_distribution3_y_avg** | **float, none_type** | Returns capital gains distribution(3Yr) information. | [optional] 
**max_lt_gains_rate** | **float, none_type** | Returns maximum Long Term Gains Rate | [optional] 
**max_st_gains_rate** | **float, none_type** | Returns maximum Short Term Gains Rate | [optional] 
**tax_on_distributions** | **float, none_type** | Returns tax on distributions. | [optional] 
**distribute_k1** | **float, none_type** | Returns the details if the funds distribute K1 | [optional] 
**latest_lt_cap_gains_dist** | **float, none_type** | Returns the latest Long Term Capital Gains Distribution | [optional] 
**latest_lt_cap_gains_dist_date** | **date, none_type** | Returns the date of the most recent distributions for the specified share class for long term gains.Daily Accrued Dividend is only available for Mutual Funds.Data is returned for both Mutual Funds and ETFs. | [optional] 
**latest_st_cap_gains_dist** | **float, none_type** | Returns the details of the latest Short Term Capital Gains Distribution | [optional] 
**latest_st_cap_gains_dist_date** | **date, none_type** | Returns the date of the most recent distributions for the specified share class for short term gains.Daily Accrued Dividend is only available for Mutual Funds.Data is returned for both Mutual Funds and ETFs. Distribution | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**fund_vs_segment_benchmark** | [**FundVsSegmentBenchmark**](FundVsSegmentBenchmark.md) |  | [optional] 
**fund** | [**Fund**](Fund.md) |  | [optional] 
**sri_priips** | **int, none_type** | The SRI (Summary Risk Indicator) illustrates PRIIPs&#39; risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk. | [optional] 
**srri_ucits** | **int, none_type** | Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund&#39;s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


