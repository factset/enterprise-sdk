/**
 * BookBuilder
 * The BookBuilder API is a powerful tool that combines detailed reports for companies of interest. Save time by using a single source of knowledge instead of relying on multiple APIs to create a presentation ready PDF, also known as a Public Information Book(PIB). </br></br> Consistently create books with the same content/reports for different companies by defining templates with the set of reports saved for re-use. Or, use templates that are created by FactSet for quick use. </br></br> With our powerful API endpoints, you can get the information on companies of interest quickly where and when you need it. </br></br> 
 *
 * The version of the OpenAPI document: 1.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The BookProcessingResponseItem model module.
 * @module model/BookProcessingResponseItem
 */
class BookProcessingResponseItem {
    /**
     * Constructs a new <code>BookProcessingResponseItem</code>.
     * @alias module:model/BookProcessingResponseItem
     */
    constructor() { 
        
        BookProcessingResponseItem.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BookProcessingResponseItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BookProcessingResponseItem} obj Optional instance to populate.
     * @return {module:model/BookProcessingResponseItem} The populated <code>BookProcessingResponseItem</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BookProcessingResponseItem();

            if (data.hasOwnProperty('Message')) {
                obj['Message'] = ApiClient.convertToType(data['Message'], 'String');
            }
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = ApiClient.convertToType(data['Status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Download Book AWS Processing message.
 * @member {String} Message
 */
BookProcessingResponseItem.prototype['Message'] = undefined;

/**
 * Status code indicating the processing state.
 * @member {String} Status
 */
BookProcessingResponseItem.prototype['Status'] = undefined;






export default BookProcessingResponseItem;

