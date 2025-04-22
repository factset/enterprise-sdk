# factsetconcordance.EntityTaskStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **Number** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**taskName** | **String** | User-defined name for the task used to name the output file. | [optional] 
**taskAction** | **String** | Action status for the Concordance Task process. | [optional] 
**status** | **String** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**inputFile** | **String** | The input file is posted as a file object in the form.  | [optional] 
**clientIdColumn** | **String** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**priorityColumn** | **String** | Header Name of the column in the inputfile that contains the priority for the client id  | [optional] 
**bbgFigiColumn** | **String** | Header Name of the column in the input file for the type Bloomberg Listing/Regional/Security ID. | [optional] 
**bbgTickerColumn** | **String** | Header Name of the column in the input file for the type Bloomberg Listing and Regional Ticker. | [optional] 
**bicColumn** | **String** | Header Name of the column in the input file for the type BICCode, bank indentification code. | [optional] 
**cikColumn** | **String** | Header Name of the column in the input file for the type CIK, Edgar Central Index Keys. | [optional] 
**crdColumn** | **String** | Header Name of the column in the input file for the type CRD, Central Registration Depository. | [optional] 
**cusipColumn** | **String** | Header Name of the column in the input file for the type CUSIP. | [optional] 
**einColumn** | **String** | Header Name of the column in the input file for the type EmployerIdentificationNumber, EIN. | [optional] 
**factsetIdColumn** | **String** | Header Name of the column in the input file for the type FactSet Identifier - &#x60;FactSet -E,-S,-R, -L Permanent Identifier. | [optional] 
**fitchColumn** | **String** | Header Name of the column in the input file for the type FitchCreditRating, Fitch Ratings Identifier. | [optional] 
**gvkeyColumn** | **String** | Header Name of the column in the input file for the type GVKEY - Compustat Global Company Key. | [optional] 
**gvkeyIidColumn** | **String** | Header Name of the column in the input file for the type GVKEY+IID - Compustat Global Company Key and Issue Identifier. | [optional] 
**isinColumn** | **String** | Header Name of the column in the input file for the type ISIN. | [optional] 
**jcnColumn** | **String** | Header Name of the column in the input file for the type JCN - Japanese Corporate Number. | [optional] 
**leiColumn** | **String** | Header Name of the column in the input file for the type LegalEntityIdentifier, LEI. | [optional] 
**lxidColumn** | **String** | Header Name of the column in the input file for the type LXID - Markit Syndicated Loan Identifier. | [optional] 
**mdColumn** | **String** | Header Name of the column in the input file for the type MoodysIssuer, Moody&#39;s Ratings Identifier. | [optional] 
**redCodeColumn** | **String** | Header Name of the column in the input file for the type Red Code - Markit Reference Entity Identifier. | [optional] 
**rssdColumn** | **String** | Header Name of the column in the input file for the type FederalReserveRSSDIdentifier, RSSD. | [optional] 
**sedolColumn** | **String** | Header Name of the column in the input file for the type SEDOL. | [optional] 
**sprColumn** | **String** | Header Name of the column in the input file for the type S&amp;PRating, S&amp;P Ratings Identifier | [optional] 
**tickerColumn** | **String** | Header Name of the column in the input file for the type PriceTicker. | [optional] 
**tickerExchangeColumn** | **String** | Header Name of the column in the input file for the type TickerExch. | [optional] 
**tickerRegionColumn** | **String** | Header Name of the column in the input file for the type TickerRegion. | [optional] 
**ukchColumn** | **String** | Header Name of the column in the input file for the type UKCompanyHouse. | [optional] 
**valorenColumn** | **String** | Header Name of the column in the input file for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification. | [optional] 
**wknColumn** | **String** | Header Name of the column in the input file for the type WKN, German Securities Identification. | [optional] 
**nameColumn** | **String** | Name of the column in the input file that contains the entity name to be matched. | [optional] 
**countryColumn** | **String** | Name of the column in the input file that contains the ISO2 country code corresponding to the entity name.  The country code is used when evaluating candidates for a match.  | [optional] 
**stateColumn** | **String** | Name of the column in the input file that contains the Two-character state code corresponding to the entity name. The state code is used when evaluating candidates for a match.  | [optional] 
**urlColumn** | **String** | Name of the column in the input file that contains the URL corresponding to the entity name. The URL is used when evaluating candidates for a match.  | [optional] 
**additionalContextColumns** | **[String]** | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional] 
**hasResult** | **Boolean** | Flag denoting the taskId has a result. | [optional] 
**taskSubmitTime** | **Date** | Time the Task was submitted in UTC. | [optional] 
**message** | **String** | Textual message for the status. | [optional] 
**inputCount** | **Number** | Number of records in the Input File. | [optional] 
**mappedCount** | **Number** | Number of records with status of MAPPED the Input File. | [optional] 
**unmappedCount** | **Number** | Number of records with status of UNMAPPED the Input File. | [optional] 
**indeterminateCount** | **Number** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**processStartTime** | **Date** | Process start time in UTC. | [optional] 
**processDuration** | **Number** | Process duration in seconds. | [optional] 
**tryCount** | **Number** | Number of tries made so far for the request. | [optional] 
**decisionRate** | **Number** | Percentage of mapped entities in the Input File. | [optional] 
**error** | **String** |  | [optional] 
**errorTitle** | **String** |  | [optional] 
**includeEntityType** | **[String]** | Requested Entity types to include.  | [optional] 
**excludeEntityType** | **[String]** | Requested Entity types to exclude.  | [optional] 
**includeEntitySubType** | **[String]** | Requested Entity subtypes to include.  | [optional] 
**excludeEntitySubType** | **[String]** | Requested Entity subtypes to exclude.  | [optional] 
**userSerial** | **String** | user-serial of the person who initiated the entity task. | [optional] 
**userFullName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**universeId** | **Number** | The universe id this task was submitted to.  | [optional] 
**universeName** | **String** | The name of the universe this task was submitted to.  | [optional] 
**autoRemap** | **Boolean** | When &#x60;true&#x60;, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.**  | [optional] 



## Enum: StatusEnum


* `PENDING` (value: `"PENDING"`)

* `IN_PROGRESS` (value: `"IN_PROGRESS"`)

* `SUCCESS` (value: `"SUCCESS"`)

* `FAILURE` (value: `"FAILURE"`)

* `BAD_REQUEST` (value: `"BAD_REQUEST"`)

* `ABORTED` (value: `"ABORTED"`)




