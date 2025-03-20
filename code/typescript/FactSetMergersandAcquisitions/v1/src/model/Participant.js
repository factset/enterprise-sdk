/**
 * FactSet Mergers and Acquisitions API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Participant model module.
 * @module model/Participant
 */
class Participant {
    /**
     * Constructs a new <code>Participant</code>.
     * Participant Object
     * @alias module:model/Participant
     * @param fsymId {String} FactSet Permanent Identifier of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).
     */
    constructor(fsymId) { 
        
        Participant.initialize(this, fsymId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, fsymId) { 
        obj['fsymId'] = fsymId;
    }

    /**
     * Constructs a <code>Participant</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Participant} obj Optional instance to populate.
     * @return {module:model/Participant} The populated <code>Participant</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Participant();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('industry')) {
                obj['industry'] = ApiClient.convertToType(data['industry'], 'String');
            }
            if (data.hasOwnProperty('ultimateParentId')) {
                obj['ultimateParentId'] = ApiClient.convertToType(data['ultimateParentId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Permanent Identifier of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).
 * @member {String} fsymId
 */
Participant.prototype['fsymId'] = undefined;

/**
 * Entity name of the participant.
 * @member {String} name
 */
Participant.prototype['name'] = undefined;

/**
 * Industry of the participant based on the FactSet Industry Classification system.
 * @member {String} industry
 */
Participant.prototype['industry'] = undefined;

/**
 * FactSet Permanent Identifier of the ultimate parent of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).
 * @member {String} ultimateParentId
 */
Participant.prototype['ultimateParentId'] = undefined;






export default Participant;

