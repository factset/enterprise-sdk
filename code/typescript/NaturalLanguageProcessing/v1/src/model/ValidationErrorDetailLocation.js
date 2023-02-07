/**
 * Natural Language Processing API
 * APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ValidationErrorDetailLocation model module.
 * @module model/ValidationErrorDetailLocation
 */
class ValidationErrorDetailLocation {
    /**
     * Constructs a new <code>ValidationErrorDetailLocation</code>.
     * @alias module:model/ValidationErrorDetailLocation
     */
    constructor() { 
        
        ValidationErrorDetailLocation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ValidationErrorDetailLocation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ValidationErrorDetailLocation} obj Optional instance to populate.
     * @return {module:model/ValidationErrorDetailLocation} The populated <code>ValidationErrorDetailLocation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValidationErrorDetailLocation();

            if (data.hasOwnProperty('&lt;field_name&gt;')) {
                obj['&lt;field_name&gt;'] = ApiClient.convertToType(data['<field_name>'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} &lt;field_name&gt;
 */
ValidationErrorDetailLocation.prototype['&lt;field_name&gt;'] = undefined;






export default ValidationErrorDetailLocation;

