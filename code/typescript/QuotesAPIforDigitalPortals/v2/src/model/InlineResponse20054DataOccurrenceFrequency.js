/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse20054DataOccurrenceFrequency model module.
 * @module model/InlineResponse20054DataOccurrenceFrequency
 */
class InlineResponse20054DataOccurrenceFrequency {
    /**
     * Constructs a new <code>InlineResponse20054DataOccurrenceFrequency</code>.
     * Frequency of the coupon payments. Information about the frequency is available only if the attribute occurrence.type is set to \&quot;repeated\&quot;. See endpoint &#x60;/basic/frequency/type/list&#x60; for possible values of the frequency.
     * @alias module:model/InlineResponse20054DataOccurrenceFrequency
     */
    constructor() { 
        
        InlineResponse20054DataOccurrenceFrequency.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20054DataOccurrenceFrequency</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20054DataOccurrenceFrequency} obj Optional instance to populate.
     * @return {module:model/InlineResponse20054DataOccurrenceFrequency} The populated <code>InlineResponse20054DataOccurrenceFrequency</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20054DataOccurrenceFrequency();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the frequency.
 * @member {Number} id
 */
InlineResponse20054DataOccurrenceFrequency.prototype['id'] = undefined;

/**
 * Name of the frequency.
 * @member {String} name
 */
InlineResponse20054DataOccurrenceFrequency.prototype['name'] = undefined;






export default InlineResponse20054DataOccurrenceFrequency;

