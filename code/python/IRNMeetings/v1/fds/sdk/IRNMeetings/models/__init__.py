# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.IRNMeetings.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.IRNMeetings.model.attachment_summary_dto import AttachmentSummaryDto
from fds.sdk.IRNMeetings.model.attendee_dto import AttendeeDto
from fds.sdk.IRNMeetings.model.comment_dto import CommentDto
from fds.sdk.IRNMeetings.model.comment_summary_dto import CommentSummaryDto
from fds.sdk.IRNMeetings.model.create_body_dto import CreateBodyDto
from fds.sdk.IRNMeetings.model.create_comment_dto import CreateCommentDto
from fds.sdk.IRNMeetings.model.create_custom_field_value_dto import CreateCustomFieldValueDto
from fds.sdk.IRNMeetings.model.create_meeting_dto import CreateMeetingDto
from fds.sdk.IRNMeetings.model.custom_field_value_dto import CustomFieldValueDto
from fds.sdk.IRNMeetings.model.location_dto import LocationDto
from fds.sdk.IRNMeetings.model.meeting_dto import MeetingDto
from fds.sdk.IRNMeetings.model.meeting_event_dto import MeetingEventDto
from fds.sdk.IRNMeetings.model.meeting_summary_dto import MeetingSummaryDto
from fds.sdk.IRNMeetings.model.new_item_dto import NewItemDto
from fds.sdk.IRNMeetings.model.operation import Operation
from fds.sdk.IRNMeetings.model.operation_type import OperationType
from fds.sdk.IRNMeetings.model.problem_details import ProblemDetails
from fds.sdk.IRNMeetings.model.record_change_dto import RecordChangeDto
from fds.sdk.IRNMeetings.model.record_event_summary_dto import RecordEventSummaryDto
from fds.sdk.IRNMeetings.model.reference_attendee_dto import ReferenceAttendeeDto
from fds.sdk.IRNMeetings.model.related_records_dto import RelatedRecordsDto
from fds.sdk.IRNMeetings.model.subcomment_summary_dto import SubcommentSummaryDto
from fds.sdk.IRNMeetings.model.update_meeting_dto import UpdateMeetingDto
from fds.sdk.IRNMeetings.model.user_serial_dto import UserSerialDto
