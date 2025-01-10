# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.EventCalendar.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.EventCalendar.model.company_event_request import CompanyEventRequest
from fds.sdk.EventCalendar.model.company_event_request_data import CompanyEventRequestData
from fds.sdk.EventCalendar.model.company_event_request_data_date_time import CompanyEventRequestDataDateTime
from fds.sdk.EventCalendar.model.company_event_request_data_universe import CompanyEventRequestDataUniverse
from fds.sdk.EventCalendar.model.company_event_response import CompanyEventResponse
from fds.sdk.EventCalendar.model.company_event_response_data import CompanyEventResponseData
from fds.sdk.EventCalendar.model.error import Error
from fds.sdk.EventCalendar.model.error_response import ErrorResponse
