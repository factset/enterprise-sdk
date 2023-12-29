# EntityMappingRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universe_id** | **int** | The universe to save this mapping to. | 
**client_id** | **str** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. | 
**client_name** | **str** | Name of entity to match. | 
**entity_id** | **str** | FactSet Entity Identifier mapped to the submitted entity. | [optional] 
**client_country** | **str** | ISO2 country code corresponding to the Entity name. | [optional] 
**client_state** | **str** | ISO Code of State or Province location to map Entity. | [optional] 
**client_url** | **str** | URL corresponding to the entity name. | [optional] 
**client_bbg_figi** | **str** | User provided input for Bloomberg Listing/Regional/Security ID symbol type. | [optional] 
**client_bbg_ticker** | **str** | User provided input for Bloomberg Listing and Regional Ticker symbol type. | [optional] 
**client_bic** | **str** | User provided input for BICCode, bank indentification code symbol type. | [optional] 
**client_cik** | **str** | User provided input for CIK, Edgar Central Index Keys symbol type. | [optional] 
**client_crd** | **str** | User provided input for CRD, Central Registration Depository symbol type. | [optional] 
**client_cusip** | **str** | User provided input for CUSIP symbol type. | [optional] 
**client_duns** | **str** | User provided input for DUNS, Dun&amp;Bradstreet symbol type. | [optional] 
**client_ein** | **str** | User provided input for EmployerIdentificationNumber, EIN symbol type. | [optional] 
**client_factset_id** | **str** | User provided input for FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier symbol type. | [optional] 
**client_fitch** | **str** | User provided input for FitchCreditRating, Fitch Ratings Identifier symbol type. | [optional] 
**client_gvkey_iid** | **str** | User provided input for GVKEY+IID, Compustat Global Company Key and Issue Identifier symbol type. | [optional] 
**client_gvkey** | **str** | User provided input for GVKEY, Compustat Global Company Key symbol type. | [optional] 
**client_isin** | **str** | User provided input for ISIN symbol type. | [optional] 
**client_jcn** | **str** | User provided input for JCN , Japanese Corporate Number symbol type. | [optional] 
**client_lei** | **str** | User provided input for LegalEntityIdentifier, LEI symbol type. | [optional] 
**client_lxid** | **str** | User provided input for LXID, Markit Syndicated Loan Identifier symbol type. | [optional] 
**client_md** | **str** | User provided input for MoodysIssuer, Moody&#39;s Ratings Identifier symbol type. | [optional] 
**client_ticker** | **str** | User provided input for PriceTicker symbol type. | [optional] 
**client_priority** | **str** | Name of the priority column as provided by the user. | [optional] 
**client_red_code** | **str** | User provided input for RedCode, Markit Reference Entity Identifier symbol type. | [optional] 
**client_rssd** | **str** | User provided input for FederalReserveRSSDIdentifier, RSSD symbol type. | [optional] 
**client_sedol** | **str** | User provided input for SEDOL symbol type. | [optional] 
**client_spr** | **str** | User provided input for S&amp;PRating, S&amp;P Ratings Identifier. | [optional] 
**client_ticker_exchange** | **str** | User provided input for TickerExch symbol type. | [optional] 
**client_ticker_region** | **str** | User provided input for TickerRegion symbol type | [optional] 
**client_ukch** | **str** | User provided input for UKCompanyHouse symbol type | [optional] 
**client_valoren** | **str** | User provided input for VALOR, Valoren (\&quot;Valor\&quot;) Identification symbol type. | [optional] 
**client_wkn** | **str** | User provided input for WKN, German Securities Identification symbol type. | [optional] 
**client_additional_context** | **{str: (str,)}** | Any additional context information that can be saved along with other input values for mapping. To be used by Managed Service for mapping any unmapped records.   | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


