/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PeopleMatch model module.
 * @module model/PeopleMatch
 */
class PeopleMatch {
    /**
     * Constructs a new <code>PeopleMatch</code>.
     * People Match object showing the decision reached for each Entity. 
     * @alias module:model/PeopleMatch
     */
    constructor() { 
        
        PeopleMatch.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PeopleMatch</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PeopleMatch} obj Optional instance to populate.
     * @return {module:model/PeopleMatch} The populated <code>PeopleMatch</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PeopleMatch();

            if (data.hasOwnProperty('activeRole')) {
                obj['activeRole'] = ApiClient.convertToType(data['activeRole'], 'String');
            }
            if (data.hasOwnProperty('clientEntity')) {
                obj['clientEntity'] = ApiClient.convertToType(data['clientEntity'], 'String');
            }
            if (data.hasOwnProperty('clientFirstName')) {
                obj['clientFirstName'] = ApiClient.convertToType(data['clientFirstName'], 'String');
            }
            if (data.hasOwnProperty('clientLastName')) {
                obj['clientLastName'] = ApiClient.convertToType(data['clientLastName'], 'String');
            }
            if (data.hasOwnProperty('clientMiddleName')) {
                obj['clientMiddleName'] = ApiClient.convertToType(data['clientMiddleName'], 'String');
            }
            if (data.hasOwnProperty('clientSalutation')) {
                obj['clientSalutation'] = ApiClient.convertToType(data['clientSalutation'], 'String');
            }
            if (data.hasOwnProperty('clientSuffix')) {
                obj['clientSuffix'] = ApiClient.convertToType(data['clientSuffix'], 'String');
            }
            if (data.hasOwnProperty('clientPriority')) {
                obj['clientPriority'] = ApiClient.convertToType(data['clientPriority'], 'String');
            }
            if (data.hasOwnProperty('clientPersonName')) {
                obj['clientPersonName'] = ApiClient.convertToType(data['clientPersonName'], 'String');
            }
            if (data.hasOwnProperty('firstName')) {
                obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
            }
            if (data.hasOwnProperty('personId')) {
                obj['personId'] = ApiClient.convertToType(data['personId'], 'String');
            }
            if (data.hasOwnProperty('lastName')) {
                obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
            }
            if (data.hasOwnProperty('middleName')) {
                obj['middleName'] = ApiClient.convertToType(data['middleName'], 'String');
            }
            if (data.hasOwnProperty('entity')) {
                obj['entity'] = ApiClient.convertToType(data['entity'], 'String');
            }
            if (data.hasOwnProperty('mapStatus')) {
                obj['mapStatus'] = ApiClient.convertToType(data['mapStatus'], 'String');
            }
            if (data.hasOwnProperty('matchFlag')) {
                obj['matchFlag'] = ApiClient.convertToType(data['matchFlag'], 'String');
            }
            if (data.hasOwnProperty('nameMatchSource')) {
                obj['nameMatchSource'] = ApiClient.convertToType(data['nameMatchSource'], 'String');
            }
            if (data.hasOwnProperty('nameMatchString')) {
                obj['nameMatchString'] = ApiClient.convertToType(data['nameMatchString'], 'String');
            }
            if (data.hasOwnProperty('rowIndex')) {
                obj['rowIndex'] = ApiClient.convertToType(data['rowIndex'], 'Number');
            }
            if (data.hasOwnProperty('similarityScore')) {
                obj['similarityScore'] = ApiClient.convertToType(data['similarityScore'], 'Number');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('universeId')) {
                obj['universeId'] = ApiClient.convertToType(data['universeId'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * This tells whether the person is now active in the entity
 * @member {String} activeRole
 */
PeopleMatch.prototype['activeRole'] = undefined;

/**
 * The entity for which the person is working. 
 * @member {String} clientEntity
 */
PeopleMatch.prototype['clientEntity'] = undefined;

/**
 * First Name provided in the input file which is used in the `people-task` endpoint
 * @member {String} clientFirstName
 */
PeopleMatch.prototype['clientFirstName'] = undefined;

/**
 * Last Name provided in the input file which is used in the `people-task` endpoint
 * @member {String} clientLastName
 */
PeopleMatch.prototype['clientLastName'] = undefined;

/**
 * Middle Name provided in the input file which is used in the `people-task` endpoint
 * @member {String} clientMiddleName
 */
PeopleMatch.prototype['clientMiddleName'] = undefined;

/**
 * Salutation provided in the input file which is used in the `people-task` endpoint
 * @member {String} clientSalutation
 */
PeopleMatch.prototype['clientSalutation'] = undefined;

/**
 * Suffix provided in the input file which is used in the `people-task` endpoint
 * @member {String} clientSuffix
 */
PeopleMatch.prototype['clientSuffix'] = undefined;

/**
 * Priority provided in the input file which is used in the `people-task` endpoint
 * @member {String} clientPriority
 */
PeopleMatch.prototype['clientPriority'] = undefined;

/**
 * The person name as provided in request.
 * @member {String} clientPersonName
 */
PeopleMatch.prototype['clientPersonName'] = undefined;

/**
 * The first name of the client.
 * @member {String} firstName
 */
PeopleMatch.prototype['firstName'] = undefined;

/**
 * The id of the person.
 * @member {String} personId
 */
PeopleMatch.prototype['personId'] = undefined;

/**
 * The last name of the person.
 * @member {String} lastName
 */
PeopleMatch.prototype['lastName'] = undefined;

/**
 * The middle name of the client.
 * @member {String} middleName
 */
PeopleMatch.prototype['middleName'] = undefined;

/**
 * Full name corresponding to the matched entity.
 * @member {String} entity
 */
PeopleMatch.prototype['entity'] = undefined;

/**
 * Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. 
 * @member {module:model/PeopleMatch.MapStatusEnum} mapStatus
 */
PeopleMatch.prototype['mapStatus'] = undefined;

/**
 * Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. 
 * @member {String} matchFlag
 */
PeopleMatch.prototype['matchFlag'] = undefined;

/**
 * Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. 
 * @member {String} nameMatchSource
 */
PeopleMatch.prototype['nameMatchSource'] = undefined;

/**
 * String on which the Concordance algorithm mapped the submitted entity.
 * @member {String} nameMatchString
 */
PeopleMatch.prototype['nameMatchString'] = undefined;

/**
 * Country name corresponding to the location of the matched entity
 * @member {Number} rowIndex
 */
PeopleMatch.prototype['rowIndex'] = undefined;

/**
 * Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. 
 * @member {Number} similarityScore
 */
PeopleMatch.prototype['similarityScore'] = undefined;

/**
 * The title that the person is holding.
 * @member {String} title
 */
PeopleMatch.prototype['title'] = undefined;

/**
 * The universe identifier
 * @member {Number} universeId
 */
PeopleMatch.prototype['universeId'] = undefined;





/**
 * Allowed values for the <code>mapStatus</code> property.
 * @enum {String}
 * @readonly
 */
PeopleMatch['MapStatusEnum'] = {

    /**
     * value: "MAPPED"
     * @const
     */
    "MAPPED": "MAPPED",

    /**
     * value: "UNMAPPED"
     * @const
     */
    "UNMAPPED": "UNMAPPED",

    /**
     * value: "INDETERMINATE"
     * @const
     */
    "INDETERMINATE": "INDETERMINATE"
};



export default PeopleMatch;
