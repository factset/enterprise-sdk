

# DataFiles

Returns Data Response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trialId** | **String** | ID of the trial assigned by the trial registry. |  [optional]
**version** | **Integer** | Specifies the version of a trial. |  [optional]
**fileName** | **String** | The filename of the trial data. |  [optional]
**clinicalTrialId** | **String** | Specifies Ozmosi unique ID for each historical version of a trial. |  [optional]
**uniqueProtocolId** | **String** | ID assigned by the sponsor of a trial. |  [optional]
**officialTitle** | **String** | Full scientific title of a trial. |  [optional]
**overallStatus** | **String** | Defines the current stage of a trial&#39;s activity. |  [optional]
**primaryCompletion** | **OffsetDateTime** | The date where the final patient is examined or treated for the purpose of collecting data on the trial&#39;s primary outcome measures. Trial Sponsors may publicly announce the data. results after this date |  [optional]
**studyCompletion** | **OffsetDateTime** | The date that treatment will complete in the trial and data will be fully collected for secondary outcome measures and adverse events. |  [optional]
**firstPosted** | **OffsetDateTime** | The date on which the trial was first available on ClinicalTrials.gov. Specifically, this date refers to version 1 of a trial |  [optional]
**lastPosted** | **OffsetDateTime** | The date on which this version of a trial was officially updated and publicly visible on the registry. |  [optional]
**sponsor** | **String** | The primary sponsor of the trial. |  [optional]
**responsibleParty** | **String** | Identifies if the responsible party of the trial is the Sponsor (The entity that initiates the study), the Principal Investigator (An individual designated by the Sponsor) or Sponsor-Investigator (An individual both initiating and conduct the trial) |  [optional]
**dataMonitoring** | **String** | Identifies if the trial involves a group of independent scientists who monitor the safety and scientific integrity of a clinical trial. |  [optional]
**studyType** | **String** | Describes the nature of a clinical study. |  [optional]
**primaryPurpose** | **String** | Describes the main reason for the clinical trial. |  [optional]
**studyPhase** | **String** | Specifies the stage of a clinical trial studying a drug or biological product. |  [optional]
**interventionalModel** | **String** | Describes the general design of the strategy for assigning interventions to participants in a clinical study. |  [optional]
**numberOfArms** | **Integer** | The number of clinical arms for study. |  [optional]
**masking** | **String** | Defines the type of masking. |  [optional]
**allocation** | **String** | Identifies the method used to assign participants to an arm of a clinical study. |  [optional]
**enrollment** | **Integer** | Number of patients enrolled. |  [optional]
**minimumAge** | **String** | Minimum age of participants. |  [optional]
**maximumAge** | **String** | Maximum age of participants. |  [optional]
**sex** | **String** | A type of eligibility criteria that indicates the sex of people who may participate in a clinical study. |  [optional]
**genderBased** | **String** | Defines if study is gender specific. |  [optional]
**acceptsVolunteers** | **String** | A type of eligibility criteria that indicates whether people who do not have the condition/disease being studied can participate in that clinical study. |  [optional]
**date** | **OffsetDateTime** | Specifies the timestamp of each version of a trial. |  [optional]
**recordVerification** | **OffsetDateTime** | The date on which the responsible party last verified the clinical study information in the entire ClinicalTrials.gov record for the clinical study, even if no additional or updated information is being submitted |  [optional]
**studyStart** | **OffsetDateTime** | Date that the trial becomes open for recruitment or the date on which the first patient was enrolled. |  [optional]
**firstSubmitted** | **OffsetDateTime** | The date that the trial was submitted to the registry. |  [optional]
**firstSubmitMetQxCrite** | **OffsetDateTime** | The date on which a submitted study record is confirmed to be consistent with National Library of Medicine (NLM) quality control (QC) review criteria. |  [optional]
**lastSubmitMetQxCrite** | **OffsetDateTime** | The most recent date on which the study sponsor or investigator submitted changes to a study record. |  [optional]
**primaryCompDateType** | **String** | Designates if primary completion date is actual or anticipated. |  [optional]
**studyCompletionDateType** | **String** | Designates if study completion date is actual or anticipated. |  [optional]
**firstPostedDateType** | **String** | Designates if the first posted date is actual or anticipated. |  [optional]
**lastPostedDateType** | **String** | Designates if the last update posted date is actual or anticipated. |  [optional]
**enrollmentType** | **String** | Identifies if the enrollment number is the anticipated or actual amount. |  [optional]
**beamProbabilityOfTrialSuccess** | **BigDecimal** | Probability of trial success. |  [optional]
**beamProbabilityOfLaunch** | **BigDecimal** | Probability of trial being launched. |  [optional]
**url** | **String** | Download link for the clinical trials provided by the Ozmosi feed. |  [optional]


## Implemented Interfaces

* Serializable


